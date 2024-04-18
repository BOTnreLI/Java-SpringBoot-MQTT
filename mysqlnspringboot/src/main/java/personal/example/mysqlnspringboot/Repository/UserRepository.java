package personal.example.mysqlnspringboot.Repository;

import org.springframework.data.repository.CrudRepository;

import personal.example.mysqlnspringboot.SensorData.SensorData;

public interface UserRepository extends CrudRepository<SensorData, Long> {
    
}
