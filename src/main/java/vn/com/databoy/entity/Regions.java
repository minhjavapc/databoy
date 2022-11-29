package vn.com.databoy.entity;


import jp.sf.amateras.mirage.annotation.Column;
import jp.sf.amateras.mirage.annotation.PrimaryKey;
import jp.sf.amateras.mirage.annotation.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Table(name = "REGIONS")
public class Regions {
    @Id
    @PrimaryKey(generationType = PrimaryKey.GenerationType.SEQUENCE, generator = "SEQ_REGIONS")
    @Column(name = "REGION_ID")
    private Long regionId;

    @Column(name = "REGION_NAME")
    private String regionName;
}

//    CREATE SEQUENCE SEQ_REGIONS
//        START WITH     5
//        INCREMENT BY   1
//        NOCACHE
//        NOCYCLE;