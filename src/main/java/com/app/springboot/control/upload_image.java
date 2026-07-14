package com.app.springboot.control;

import com.app.springboot.server.image_service;
import com.app.springboot.util.StateUtil;
import com.app.springboot.util.Uploadimage_load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Controller
public class upload_image {

    private static final List<String> ALLOWED_EXTENSIONS = Arrays.asList(".jpg", ".jpeg", ".png", ".gif", ".bmp");

    @PostMapping("/upload_image")
    @ResponseBody
    public Uploadimage_load upload_image(@RequestParam(value = "file") MultipartFile file, Model model) throws IOException {
        if(!file.isEmpty()) {
            String file_name = file.getOriginalFilename();
            if (file_name == null || !file_name.contains(".")) {
                return new Uploadimage_load("文件名无效","",400);
            }
            
            String suffixname = file_name.substring(file_name.lastIndexOf(".")).toLowerCase();
            if (!ALLOWED_EXTENSIONS.contains(suffixname)) {
                return new Uploadimage_load("文件类型不允许，仅支持jpg/jpeg/png/gif/bmp","",400);
            }

            String path = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/layuimini/image_out/";
            String filePath = UUID.randomUUID() + suffixname;

            File file1 = new File(path + filePath);
            file.transferTo(file1);

            System.out.println("上传完成！！");
            return new Uploadimage_load("图片上传成功",filePath,200);
        } else {
            System.out.println("文件为空！！");
        }
        return new Uploadimage_load("图片上传失败","",400);
    }

    @GetMapping("/upload")
    public String upload(){


        return "page/upload";
    }

}
