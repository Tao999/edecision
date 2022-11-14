package com.example.edecision.controller;
import com.example.edecision.model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;



@RestController
public class ProjectController {

    private static Map<Long, Project> depotProject = new HashMap();

    static {
        Project Google = new Project();
        Google.setDescription("developement de Google");
        Google.setTitle("Google application");
        depotProject.put(Google.getId(), Google);

        Project Amazon = new Project();
        Google.setDescription("developement de Google");
        Google.setTitle("Google application");
        depotProject.put(Amazon.getId(), Google);

        Project Facebook = new Project();
        Google.setDescription("developement de Facebook");
        Google.setTitle("Google application");
        depotProject.put(Facebook.getId(), Google);
    }

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ResponseEntity<Object> afficher() {
        return new ResponseEntity<>(depotProject.values(), HttpStatus.OK);
    }

    @RequestMapping(value = "/supprimer/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> supprimer(@PathVariable("id") String id) {
        depotProject.remove(id);
        return new ResponseEntity<>("Le projet n°" + id + " a bien été supprimé", HttpStatus.OK);
    }

    @RequestMapping(value = "/add/{title}", method = RequestMethod.PUT)
    public ResponseEntity<Object> ajouter(@PathVariable("title") String title) {
        Project project = new Project();
        project.setTitle(title);
        depotProject.put(project.getId(), project);
        return new ResponseEntity<>("Le projet "+project.getTitle()+"a bien été ajouté", HttpStatus.OK);

    }



}
