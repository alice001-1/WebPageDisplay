const { createApp, ref, onMounted } = Vue;

const app = createApp({
   setup() {
      const activeMenu = ref('home');
      const products = ref([]);
      const patents = ref([]);
      const slideshows = ref([]);
      const companyPhone = ref('');
      const loading = ref({ products: true, patents: true, slideshows: true });

      const features = ref([
         { icon: ElementPlusIconsVue.CheckCircle, title: '专业服务', description: '提供专业的企业服务解决方案' },
         { icon: ElementPlusIconsVue.Briefcase, title: '丰富经验', description: '多年行业经验，值得信赖' },
         { icon: ElementPlusIconsVue.Award, title: '品质保证', description: '严格的品质把控体系' },
         { icon: ElementPlusIconsVue.Phone, title: '贴心售后', description: '完善的售后服务支持' }
      ]);

      const navigate = (path) => {
         window.location.href = path;
      };

      const fetchData = async (url, target, loadingKey) => {
         try {
            const res = await fetch(url);
            if (res.ok) {
               target.value = await res.json();
            }
         } catch (error) {
            console.error(`Failed to fetch ${url}:`, error);
         } finally {
            loading.value[loadingKey] = false;
         }
      };

      onMounted(() => {
         fetchData('/api/products', products, 'products');
         fetchData('/api/patents', patents, 'patents');
         fetchData('/api/slideshows', slideshows, 'slideshows');
      });

      return {
         activeMenu,
         products,
         patents,
         slideshows,
         features,
         companyPhone,
         loading,
         navigate
      };
   }
});

app.use(ElementPlus);
app.mount('#app');