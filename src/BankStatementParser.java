import java.util.List;

public interface BankStatementParser {
    
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFromCsv(List<String> lines);
}
