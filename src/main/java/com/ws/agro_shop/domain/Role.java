//package com.ws.agro_shop.domain;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * This enum is responsible for access to something resource into this system
// */
//public enum Role {
//    ADMIN("Admin"),
//    TEST_MANAGER("Test_manager"),
//    USER("User"),
//    EXTERNAL_USER("External_user");
//
//    private final String name;
//
//    Role(String name) {
//        this.name = name;
//    }
//
//    /**
//     * @return list of roles for Test Manager
//     */
//    public static List<Role> getRolesForTestManager() {
//        return Arrays
//                .stream(values())
//                .filter(role -> !role.equals(ADMIN))
//                .collect(Collectors.toList());
//    }
//
//    /**
//     * @return list of roles for Admin
//     */
//    public static List<Role> getRolesForAdmin() {
//        return Arrays.asList(values());
//    }
//
//    /**
//     * @return name {@link String}
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     *
//     * @param role  role
//     * @return true if user is external user by role
//     */
//    public static boolean isExternalUser(Role role) {
//        return role == EXTERNAL_USER;
//    }
//}