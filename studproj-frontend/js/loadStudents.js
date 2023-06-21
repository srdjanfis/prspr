import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        students: [],
        selected: "1",
        options: []
      }
    },
    created(){
        this.loadProjects();
        this.loadStudents();
    },
    methods:{
        loadStudents() {
            axios.get("http://localhost:8080/getStudentsByProjectId/"
            +this.selected)
          .then((response) => {
            this.students = response.data;
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