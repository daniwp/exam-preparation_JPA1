package entity;

import entity.ProjectUser;
import entity.Task;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-15T18:02:20")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, Boolean> created;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, Long> id;
    public static volatile SingularAttribute<Project, Date> lastModified;
    public static volatile ListAttribute<Project, ProjectUser> projectUsers;
    public static volatile ListAttribute<Project, Task> tasks;

}