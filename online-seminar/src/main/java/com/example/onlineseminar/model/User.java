package com.example.onlineseminar.model;

import lombok.Data;

@Data
public class User {
    private String user_id;
    private String user_name;
    private int user_role;
    private boolean delete_flg;
}
