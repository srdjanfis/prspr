import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        student: {
            idStudent:"",
            firstNameStudent:"",
            lastNameStudent:"",
            project:{
                idProject: "1",
                nameProject: "",
                descProject: ""
            }
        },
        options: [],
        message:" "
      }
    },
    created(){
        this.loadProjects();
    },
    methods:{
        postStudent() {
   
            axios.post("http://localhost:8080/addOrUpdateStudent",this.student)
          .then((response) => {
            this.message="Student je uspešno ustvarjen";
          })
          .catch((error) => console.error(error));
         },
         loadProjects(){
          axios.get("http://localhost:8080/getProjectsForSelect")
          .then((response) => {
            this.options = response.data;
          })
          .catch((error) => console.error(error));
         }
    }
  }).mount('#app')