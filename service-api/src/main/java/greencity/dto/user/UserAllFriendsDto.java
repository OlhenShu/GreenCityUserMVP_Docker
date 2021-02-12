package greencity.dto.user;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class UserAllFriendsDto {
    private Long id;
    private String name;
    private String city;
    private Double rating;
    private Long mutualFriends;
    private String profilePicture;
}
