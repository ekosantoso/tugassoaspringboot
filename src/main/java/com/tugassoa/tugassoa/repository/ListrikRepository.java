package com.tugassoa.tugassoa.repository;

import com.tugassoa.tugassoa.entity.Listrik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListrikRepository extends JpaRepository<Listrik,Integer> {

    @Query(value = "SELECT * FROM public.listrik where idpelanggan = :userID", nativeQuery = true)
    List<Listrik> findByUserID(String userID);
}
