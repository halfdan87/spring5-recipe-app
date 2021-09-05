package guru.springframework.repositories;

import static org.junit.Assert.*;

import guru.springframework.domain.UnitOfMeasure;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() {

    }

    @Test
    @DirtiesContext
    public void findByDescription() {
        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", unit.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> unit = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", unit.get().getDescription());
    }
}