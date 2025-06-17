package si.unm.fis.prspr.referat.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.referat.model.StudyProgram;
import si.unm.fis.prspr.referat.service.StudyProgramService;

@RestController
@RequestMapping("/studyprogram")
public class StudyProgramController {
private final StudyProgramService StudyProgramService;

    public StudyProgramController(StudyProgramService StudyProgramService) {
        this.StudyProgramService = StudyProgramService;
    }

    @GetMapping("/getStudyPrograms")
    public List<StudyProgram> getStudyPrograms() {
        return StudyProgramService.getStudyPrograms();
    }

    @PostMapping("/addStudyProgram")
    public void addStudyProgram(@RequestBody StudyProgram StudyProgram) {
        StudyProgramService.addStudyProgram(StudyProgram);
    }
    
    @PutMapping("/updateStudyProgram")
    public void updateStudyProgram(@RequestBody StudyProgram StudyProgram) {
        StudyProgramService.updateStudyProgram(StudyProgram);
    }

    @DeleteMapping("/deleteStudyProgram/{id}")
    public void deleteStudyProgram(@PathVariable Integer id) {
        StudyProgramService.deleteStudyProgram(id);
    }
}
