import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        projects: [],
        
      }
    },
    created(){
        this.loadProjects();
    },
    methods:{
        loadProjects() {
            axios.get("http://localhost:8080/getAllProjects")
          .then((response) => {
            this.projects = response.data;
          })
          .catch((error) => console.error(error));
         }
    }
  }).mount('#app')