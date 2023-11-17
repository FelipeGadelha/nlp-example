package br.com.felipe.gadelha;

import edu.stanford.nlp.ling.CoreAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.CoreDocument;

public class POSExample {

    public static void main(String[] args) {
        final var stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! I am Felipe Gadelha.";
        final var coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        final var coreLabelList = coreDocument.tokens();

        coreLabelList.forEach(c -> {
            final var pos = c.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(c.originalText() + " - " + pos);
        });

    }
}
