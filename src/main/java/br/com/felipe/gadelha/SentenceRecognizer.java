package br.com.felipe.gadelha;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

public class SentenceRecognizer {

    public static void main(String[] args) {
        final var stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Hey! I am Felipe Gadelha. I am Software Developer and Consultant.";

        final var coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        final var sentences = coreDocument.sentences();
        sentences.forEach(System.out::println);

    }
}
