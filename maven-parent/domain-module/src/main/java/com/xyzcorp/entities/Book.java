package com.xyzcorp.entities;

import java.util.List;

public record Book(String title, List<Author> authors) {}
