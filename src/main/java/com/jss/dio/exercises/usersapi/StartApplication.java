package com.jss.dio.exercises.usersapi;


import com.jss.dio.exercises.usersapi.models.Address;
import com.jss.dio.exercises.usersapi.models.Company;
import com.jss.dio.exercises.usersapi.models.Geo;
import com.jss.dio.exercises.usersapi.models.User;
import com.jss.dio.exercises.usersapi.services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
/*
@Component
public class StartApplication implements CommandLineRunner {

    @Autowired
    UserServiceImpl service;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", new Geo("-37.3159", "81.1496")), "1-770-736-8031 x56442", "hildegard.org", new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")));
        users.add(new User(2, "Ervin Howell", "Antonette", "Shanna@melissa.tv", new Address("Victor Plains", "Suite 879", "Wisokyburgh", "90566-7771", new Geo("-43.9509", "-34.4618")), "010-692-6593 x09125", "anastasia.net", new Company("Deckow-Crist", "Proactive didactic contingency", "synergize scalable supply-chains")));
        users.add(new User(3, "Clementine Bauch", "Samantha", "Nathan@yesenia.net", new Address("Douglas Extension", "Suite 847", "McKenziehaven", "59590-4157", new Geo("-68.6102", "-47.0653")), "1-463-123-4447", "ramiro.info", new Company("Romaguera-Jacobson", "Face to face bifurcated interface", "e-enable strategic applications")));
        users.add(new User(4, "Patricia Lebsack", "Karianne", "Julianne.OConner@kory.org", new Address("Hoeger Mall", "Apt. 692", "South Elvis", "53919-4257", new Geo("29.4572", "-164.2990")), "493-170-9623 x156", "kale.biz", new Company("Robel-Corkery", "Multi-tiered zero tolerance productivity", "transition cutting-edge web services")));
        users.add(new User(5, "Chelsey Dietrich", "Kamren", "Lucio_Hettinger@annie.ca", new Address("Skiles Walks", "Suite 351", "Roscoeview", "33263", new Geo("-31.8129", "62.5342")), "(254)954-1289", "demarco.info", new Company("Keebler LLC", "User-centric fault-tolerant solution", "revolutionize end-to-end systems")));
        users.add(new User(6, "Mrs. Dennis Schulist", "Leopoldo_Corkery", "Karley_Dach@jasper.info", new Address("Norberto Crossing", "Apt. 950", "South Christy", "23505-1337", new Geo("-71.4197", "71.7478")), "1-477-935-8478 x6430", "ola.org", new Company("Considine-Lockman", "Synchronised bottom-line interface", "e-enable innovative applications")));
        users.add(new User(7, "Kurtis Weissnat","Elwyn.Skiles","Telly.Hoeger@billy.biz", new Address("Rex Trail","Suite 280","Howemouth","58804-1099",new Geo( "24.8918","21.8984")),"210.067.6132","elvis.io", new Company("Johns Group","Configurable multimedia task-force","generate enterprise e-tailers")));
        users.add(new User(8,"Nicholas Runolfsdottir V","Maxime_Nienow","Sherwood@rosamond.me", new Address( "Ellsworth Summit","Suite 729","Aliyaview","45169", new Geo( "-14.3990","-120.7677")),"586.493.6943 x140","jacynthe.com", new Company("Abernathy Group","Implemented secondary concept","e-enable extensible e-tailers" )));
        users.add(new User( 9,"Glenna Reichert","Delphine", "Chaim_McDermott@dana.io", new Address("Dayna Park","Suite 449","Bartholomebury","76495-3109",new Geo("24.6463","-168.8889")),"(775)976-6794 x41206","conrad.com", new Company("Yost and Sons","Switchable contextually-based project","aggregate real-time technologies")));
        users.add(new User( 10,"Clementina DuBuque","Moriah.Stanton", "Rey.Padberg@karina.biz", new Address("Kattie Turnpike","Suite 198","Lebsackbury","31428-2261", new Geo("-38.2386","57.2232")),"024-648-3804","ambrose.net", new Company("Hoeger LLC","Centralized empowering task-force", "target end-to-end models")));


        if(service.getUsers().size() == 0) {
        for (User user :
                users) {
                try {
                    service.addUser(user);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }


}


 */
