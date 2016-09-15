package entity;

import entity.Project;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-15T18:02:20")
@StaticMetamodel(ProjectUser.class)
public class ProjectUser_ { 

    public static volatile SingularAttribute<ProjectUser, Boolean> created;
    public static volatile SingularAttribute<ProjectUser, Long> id;
    public static volatile SingularAttribute<ProjectUser, String> userName;
    public static volatile SingularAttribute<ProjectUser, String> email;
    public static volatile ListAttribute<ProjectUser, Project> usrProjects;

}