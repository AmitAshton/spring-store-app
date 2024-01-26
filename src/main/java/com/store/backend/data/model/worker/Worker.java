package com.store.backend.data.model.worker;

import com.store.backend.data.model.shop.Shop;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/**
 * This class represents a worker object with all of his attributes:
 * id, password, workerId, full name, phone number and more...
 */
@Entity(name = "worker")
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Worker {
    @Id
    private String workerId;
    @Column
    private String password;
    @Column
    private String id;
    @Column
    private String fullName;
    @Column
    private String phoneNumber;
    @Column
    private String accountNumber;
    @Column
    private Job job;

    @ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "shop_id")
    private Shop shop;

}
