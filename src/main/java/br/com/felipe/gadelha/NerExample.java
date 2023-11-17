package br.com.felipe.gadelha;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.CoreDocument;

public class NerExample {
    public static void main(String[] args) {
        final var stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! My name is Felipe Gadelha and I have friend his name is Robert. " +
            "We both are living in New York";
        final var coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        final var coreLabelList = coreDocument.tokens();
        coreLabelList.forEach(coreLabel -> {
            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
            System.out.println(coreLabel.originalText() + " - " + ner);
        });
    }
}
