package com.tugassoa.tugassoa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "listrik",schema="public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Listrik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String jenis;
    private String idpelanggan;
    private String idtagihan;
    private Integer nominal;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date transactiondate;
}
