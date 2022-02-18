package com.agaik.comparator.service.impl;


import com.agaik.comparator.model.Tank;
import com.agaik.comparator.repository.TankRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class TankServiceImplTest {

    @Mock
    TankRepository tankRepository;

    @InjectMocks
    private TankServiceImpl tankService;

    Tank tank = new Tank();

    @Test
    void getByIdShouldReturnTank(){
        tank.setName("test");
        when(tankRepository.getById(1)).thenReturn(tank);

        String current = tankService.getById(1).getName();

        String wanted = "test";


        assertEquals(wanted, current);

    }

}