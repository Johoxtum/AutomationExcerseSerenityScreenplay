package utils.data;

import models.UserData;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.Arrays;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static utils.constants.Constants.REGISTER_DATA;

public class DataManager {

    enum Users{
        PABLO("Pablo","Usuario para registro"){
            @Override
            public UserData registerData(){
                return new UserData("Pablo","pablito123@gmail.com","1234","Pablo","Gonzales","Nueva empresa","Calle 25 #10","Cundinamarca","Nueva cali","12345","3215478987");
            }
        },
        KEVIN("Kevin", "Usuario predeterminado") {
            @Override
            public UserData registerData() {
                return null;
            }
        };

        public final String userName;
        public final String description;

        private Users(String userName, String description) {
            this.userName = userName;
            this.description = description;
        }

        public abstract UserData registerData();
        public static Users fromUserName(String actorName) {
            return Arrays.stream(values())
                    .filter(users -> users.userName.equals(actorName))
                    .findFirst()
                    .orElse(KEVIN);
        }
    }
    public static void initActorWithName(String nameActor){
        Users user = Users.fromUserName(nameActor);
        theActorCalled(nameActor)
                .describedAs(user.description)
                .remember(REGISTER_DATA,user.registerData());
        String page = EnvironmentProperties.getProperty("pages.Automation");
        withCurrentActor(Open.url(page));

    }

}
