package conLang.personalLang.interfaces;

// Import necessary ANTLR runtime classes
import jdk.jfr.Description;
import org.antlr.v4.runtime.*;
import conLang.personalLang.resources.iLexer;
import conLang.personalLang.resources.iParser;
import conLang.personalLang.resources.iBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.v4.gui.TreeViewer;


/**
 * Implementation of methods is to going to be revealed as soon as it becomes stable
*/

public class ConsoleInterface {

    private static HashMap<String, WordInfo> vocabulary = new HashMap<>();

    private static final String SYNTAX_FILE_PATH = "src/conLang/personalLang/resources/syntax.g4";

    static List<String> syntax;
    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

    }

    private static void readSyntaxFile() {

    }

    /** TODO: Merge {@link #checkGrammar()} and {@link #sentenceChecker()} */
    private static void checkGrammar() {

    }
    enum WORD {
        TYPE, TOKEN
    }
    private static void addOrEditVocab() {

    }
        private static boolean doesWordExist(String s, WORD word) {

        }
        private static void listTypes() {

        }


    private static void writeSemanticSyntaxFiles(String word, String category, String definition) {

        //TODO: Write the new vocab to the JSON as well

    }


    /** Vocabularies are now no longer stored in JSON, rather in the g4 file, since it's not really feasible
     * to load the JSON file at runtime and dynamically inject the vocab into the ANTLR lexer by mapping the
     * words to token types, as method override and class extension are needed to modify the lexer behaviour.
     */
    @Deprecated
    private static void sentenceChecker() {

    }

    /** We can just call {@link #regenerateLexerAndParser()} directly in {@link #writeSemanticSyntaxFiles(String, String, String)}
     * after the syntax file has been modified, since the writer method will only be called for that.
     */
    @Deprecated
    private static void triggerAsyncSyntaxFileWatcher() {

    }

    private static void regenerateLexerAndParser() {

    }


    static class WordInfo {
        String category;
        String definition;

        WordInfo(String category, String definition) {
            this.category = category;
            this.definition = definition;
        }

        @Override
        public String toString() {

        }
    }



}
