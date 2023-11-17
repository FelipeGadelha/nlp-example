package br.com.felipe.gadelha;

import edu.stanford.nlp.pipeline.CoreDocument;

public class SentimentAnalysis {
    public static void main(String[] args) {
        final var stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hello this is John. I really don't like this place.";

        final var coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        final var sentences = coreDocument.sentences();
        sentences.forEach(s -> System.out.println(s.sentiment() +"\t" + s));
    }
}
