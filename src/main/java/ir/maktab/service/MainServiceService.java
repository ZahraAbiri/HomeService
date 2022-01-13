package ir.maktab.service;


import ir.maktab.data.MainServiceDao;
import ir.maktab.model.MainService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Getter
@Setter
public class MainServiceService {
    private MainServiceDao mainServiceDao;

//   public MainService saveMainService(MainService mainService){
//       return mainServiceDao.save(mainService);
//   }
    public void deleteMainService(MainService mainservice) {
         mainServiceDao.delete((MainServiceDao) mainservice);
    }
    public Optional<MainServiceDao> findByName(String name) {
       return mainServiceDao.findByName(name);
    }
}
