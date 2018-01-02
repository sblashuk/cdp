package com.bsgfb.cdp.gc.model;

import java.util.List;

public class Node {
    private long[] array;
    private List<Node> links;

    public Node(int byteSize) {
        this.array = new long[byteSize];
    }

    public List<Node> getLinks() {
        return links;
    }

    public void setLinks(final List<Node> links) {
        this.links = links;
    }
}
