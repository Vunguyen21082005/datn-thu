package com.example.sd39.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "KhuyenMai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_khuyen_mai;
    @Column
    private String   ma_khuyen_mai;
    @Column
    private String ten_khuyen_mai;
    @Column
    private String  loai_khuyen_mai;
    @Column
    private String ngay_bat_dau;
    @Column
    private String  ngay_ket_thuc;
    @Column
    private Float so_tien_giam;
    @Column
    private String  nguoi_tao;
    @Column
    private String  nguoi_sua;
    @Column
    private String ngay_tao;
    @Column
    private String ngay_sua;
    @Column
    private Boolean trang_thai;
    @Column
    private String mo_ta;
}
