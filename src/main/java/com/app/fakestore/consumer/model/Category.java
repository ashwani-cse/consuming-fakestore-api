package com.app.fakestore.consumer.model;

import com.app.fakestore.consumer.constant.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

/**
 * @author Ashwani Kumar
 * Created on 04/01/24.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends Base {

    @NotBlank(message = Constants.Category.REQUIRED)
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "category")
    @ToString.Exclude// to exclude lazy load fields from toString
    private List<Product> products;

}
