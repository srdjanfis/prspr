package si.unm.fis.prspr.referat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.referat.model.StudyProgram;
import si.unm.fis.prspr.referat.repository.StudyProgramRepository;

@Service
public class StudyProgramService {
private final StudyProgramRepository StudyProgramRepository;

    public StudyProgramService(StudyProgramRepository StudyProgramRepository){
        this.StudyProgramRepository = StudyProgramRepository;
    }

    public List<StudyProgram> getStudyPrograms(){
        return StudyProgramRepository.findAll();
    }

    public void addStudyProgram(StudyProgram s){
        StudyProgramRepository.save(s);
    }

    public void updateStudyProgram(StudyProgram s){
        StudyProgramRepository.save(s);
    }

    public void deleteStudyProgram(Integer id){
        StudyProgramRepository.deleteById(id);
    }
}
