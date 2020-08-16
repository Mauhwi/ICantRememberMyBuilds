package com.mauhwi.icantremembermybuilds.repo;

import com.mauhwi.icantremembermybuilds.model.Esoarmor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArmorRepository extends CrudRepository<Esoarmor, Integer> {

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'headSlot'")
    List<Esoarmor> allHeadArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'bodySlot'")
    List<Esoarmor> allBodyArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'legSlot'")
    List<Esoarmor> allLegArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'bootsSlot'")
    List<Esoarmor> allBootsArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'neckSlot'")
    List<Esoarmor> allNeckArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'ringSlot'")
    List<Esoarmor> allRingArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'shoulderSlot'")
    List<Esoarmor> allShoulderArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'handSlot'")
    List<Esoarmor> allHandArmor();

    @Query("SELECT a FROM Esoarmor a WHERE a.slot = 'waistSlot'")
    List<Esoarmor> allWaistArmor();

}
