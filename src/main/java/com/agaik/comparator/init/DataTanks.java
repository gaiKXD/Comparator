package com.agaik.comparator.init;


import com.agaik.comparator.model.Tank;
import com.agaik.comparator.repository.TankRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataTanks implements ApplicationRunner {

        private  final TankRepository tankRepository;

    public DataTanks(TankRepository tankRepository) {
        this.tankRepository = tankRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
            tankRepository.save(new Tank( "CS-63" ,"X", "medium","Poland",390, 8.15f));
            tankRepository.save(new Tank( "Leopard 1" ,"X", "medium","Germany",420, 8.92f));
            tankRepository.save(new Tank( "Obj 430U" ,"X", "medium","ZSRR",440, 9.78f));
    }
}
