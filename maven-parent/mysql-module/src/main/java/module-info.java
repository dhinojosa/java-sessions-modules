module mysql.module {
    requires domain.module;
    provides com.xyzcorp.entities.BookDAO with com.xyzcorp.mysql.MySQLBookDAO;
}
