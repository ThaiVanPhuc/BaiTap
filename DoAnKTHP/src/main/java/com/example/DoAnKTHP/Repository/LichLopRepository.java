package com.example.DoAnKTHP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DoAnKTHP.models.LichLop;

import java.util.Date;
import java.util.List;

@Repository
public interface LichLopRepository extends JpaRepository<LichLop, Long> {
    List<LichLop> findByLopAndNgayAndCa(String lop, Date ngay, int ca);

    List<LichLop> findByTeacherUsername(String teacherUsername);
}