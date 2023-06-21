import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

createApp({
  data() {
    return {
      projects: [],
      project: {
        idProject: "",
        nameProject: "",
        descProject: ""
      },
      projectDown: {
        idProject: "",
        nameProject: "",
        descProject: ""
      },
      message: " ",
      selected: false
    }

  },
  created() {
    this.loadProjects();
  },
  methods: {
    loadProjects() {
      axios.get("http://localhost:8080/getAllProjects")
        .then((response) => {
          this.projects = response.data;
        })
        .catch((error) => console.error(error));
    },
    postProject() {
      if (this.selected) {
        axios.post("http://localhost:8080/addOrUpdateProject", this.projectDown)
          .then((response) => {
            this.message = "Projekt je uspešno ustvarjen";
            this.loadProjects();
            var toastElList = [].slice.call(document.querySelectorAll('.toast'))
            var toastList = toastElList.map(function (toastEl) {
              return new bootstrap.Toast(toastEl)
            })
            toastList.forEach(toast => toast.show())
          })
          .catch((error) => console.error(error));
      } else {
        this.message = "Se morate prvo strinjati s pogoji uporabe";
        var toastElList = [].slice.call(document.querySelectorAll('.toast'))
        var toastList = toastElList.map(function (toastEl) {
          return new bootstrap.Toast(toastEl)
        })
        toastList.forEach(toast => toast.show())
      }
    },
    clickList: function (project) {
      Object.assign(this.projectDown, project)
    }
  }
}).mount('#app')