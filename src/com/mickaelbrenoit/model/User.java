package com.mickaelbrenoit.model;

public class User {
    private int id;
    private String lastName;
    private String firstName;
    private String password;
    private String mail;
    private String address;
    private int role;
    private String phone;

    /**
     * Constructor which builds an user with the following informations
     *
     * @param id
     * @param lastName
     * @param firstName
     * @param password
     * @param mail
     * @param address
     * @param role 
     * @param phone
     */
    public User(int id, String lastName, String firstName, String password, String mail, String address, int role, String phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.mail = mail;
        this.address = address;
        this.role = role;
        this.phone = phone;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return role
     */
    public int getRole() {
        return role;
    }

    /**
     *
     * @param role
     */
    public void setRole(int role) {
        this.role = role;
    }

    /**
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        if (getRole() == 1) {
            return id + " - " + lastName + " - " + firstName + " - " + password + " - " + mail + " - "  + address + " - " + "administrateur" + " - " + phone;
        } else {
            return id + " - " + lastName + " - " + firstName + " - " + password + " - " + mail + " - " + address + " - " + "utilisateur" + " - " + phone;
        }
    }
}
