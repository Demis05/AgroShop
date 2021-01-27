package com.ws.agro_shop.dto;


/**
 * UserDto
 */
public class UserDto {//TODO доделать

    private String id;

    private String fullName;

    private String email;

//    private Role role;
//    private String dateAdded;
//    private String imageUrl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 37)
//                .append(getId())
//                .append(getFullName())
//                .append(getEmail())
//                .append(getRole())
//                .append(getDateAdded())
//                .append(getImageUrl())
//                .append(getStatus())
//                .append(isChecker())
//                .append(isTestee())
//                .toHashCode();
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        UserDto userDto = (UserDto) o;
//
//        return new EqualsBuilder()
//                .append(getId(), userDto.getId())
//                .append(getFullName(), userDto.getFullName())
//                .append(getEmail(), userDto.getEmail())
//                .append(getRole(), userDto.getRole())
//                .append(getDateAdded(), userDto.getDateAdded())
//                .append(getImageUrl(), userDto.getImageUrl())
//                .append(getStatus(), userDto.getStatus())
//                .append(isChecker(), userDto.isChecker())
//                .append(isTestee(), userDto.isTestee())
//                .isEquals();
//    }

//    @Override
//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("id", id)
//                .append("fullName", fullName)
//                .append("email", email)
//                .append("role", role)
//                .append("dateAdded", dateAdded)
//                .append("imageUrl", imageUrl)
//                .append("status", status)
//                .append("checker", checker)
//                .append("testee", testee)
//                .toString();
//    }
}
