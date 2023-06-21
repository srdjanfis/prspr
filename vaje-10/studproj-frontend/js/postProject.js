import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        project: {
            idProject:"",
            nameProject:"",
            descProject:"",
        },
        message:" "
      }
    },
 
    methods:{
        postProject() {
   
         axios.post("http://localhost:8080/addOrUpdateProject",this.project)
          .then((response) => {
            this.message="Projekt je uspešno ustvarjen";
          })
          .catch((error) => console.error(error));
         }
    }
  }).mount('#app')