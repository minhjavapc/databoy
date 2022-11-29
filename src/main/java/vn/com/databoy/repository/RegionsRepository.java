package vn.com.databoy.repository;

import org.springframework.data.mirage.repository.MirageRepository;
import vn.com.databoy.entity.Regions;

public interface RegionsRepository extends MirageRepository<Regions, Long> {
    Regions dungcogionmatak();
}