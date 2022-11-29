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
    @Column(name = "REGIONS_ID")
    private Long regionsId;

    @Column(name = "REGIONS_NAME")
    private Long regionsName;
}

//    CREATE SEQUENCE SEQ_REGIONS
//        START WITH     5
//        INCREMENT BY   1
//        NOCACHE
//        NOCYCLE;