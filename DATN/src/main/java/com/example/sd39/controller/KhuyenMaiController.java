package com.example.sd39.controller;

import com.example.sd39.model.KhuyenMai;
import com.example.sd39.repository.KhuyenMaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KhuyenMaiController {
    @Autowired
    private KhuyenMaiRepository khuyenMaiRepository;

    @GetMapping("khuyen-mai/hien-thi")
    public List<KhuyenMai> hienThi() {
        return khuyenMaiRepository.findAll();
    }

    @PostMapping("khuyen-mai/add")
    private String them(@RequestBody KhuyenMai khuyenMai) {
        khuyenMaiRepository.save(khuyenMai);
        return "Thêm thành công";
    }

    @PostMapping("khuyen-mai/update")
    private String sua(@RequestBody KhuyenMai khuyenMai) {
        khuyenMaiRepository.save(khuyenMai);
        return "Sua thành công";
    }

    @GetMapping("khuyen-mai/delete")
    private String xoa(@RequestParam("id_khuyen_mai") Integer id_khuyen_mai) {
        khuyenMaiRepository.deleteById(id_khuyen_mai);
        return "Xoa thanh cong";
    }

    @GetMapping("khuyen-mai/detail/{id}")
    private KhuyenMai xem(@PathVariable("id_khuyen_mai") Integer id_khuyen_mai) {
        return khuyenMaiRepository.findById(id_khuyen_mai).get();
    }
}
