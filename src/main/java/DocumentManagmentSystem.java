import java.util.List;

public interface DocumentManagmentSystem {
    void importFile(String path);
    List<Document> contents();
}
