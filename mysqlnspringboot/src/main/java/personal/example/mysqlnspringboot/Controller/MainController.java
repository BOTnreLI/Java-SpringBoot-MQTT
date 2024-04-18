package personal.example.mysqlnspringboot.Controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import personal.example.mysqlnspringboot.Repository.UserRepository;
import personal.example.mysqlnspringboot.SensorData.SensorData;

@Controller
@RequestMapping(path="demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewData(@RequestParam Double temp, @RequestParam Double hum
    , @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime timestamp){
        SensorData newData = new SensorData();
        newData.setHumidity(hum);
        newData.setTemperature(temp);
        newData.setCreatedAt(timestamp); 
        userRepository.save(newData);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<SensorData> getAllData(){
        return userRepository.findAll();
    }
}
