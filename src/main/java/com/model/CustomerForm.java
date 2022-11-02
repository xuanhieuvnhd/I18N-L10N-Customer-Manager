package com.model;

import org.springframework.web.multipart.MultipartFile;

public class CustomerForm {
    private Long id;
    private String firstName;
    private String lastName;
    private MultipartFile image;
    private Province province;

    public CustomerForm() {
    }

    public CustomerForm(Long id, String firstName, String lastName, MultipartFile image, Province province) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.province = province;
    }

    public CustomerForm(String firstName, String lastName, MultipartFile image, Province province) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
