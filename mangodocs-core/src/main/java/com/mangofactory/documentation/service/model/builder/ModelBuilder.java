package com.mangofactory.documentation.service.model.builder;

import com.fasterxml.classmate.ResolvedType;
import com.mangofactory.documentation.schema.Model;
import com.mangofactory.documentation.schema.ModelProperty;

import java.util.List;
import java.util.Map;

import static com.mangofactory.documentation.service.model.builder.BuilderDefaults.*;

public class ModelBuilder {
  private String id;
  private String name;
  private String qualifiedType;
  private Map<String, ModelProperty> properties;
  private String description;
  private String baseModel;
  private String discriminator;
  private List<String> subTypes;
  private ResolvedType modelType;

  public ModelBuilder id(String id) {
    this.id = defaultIfAbsent(id, this.id);
    return this;
  }

  public ModelBuilder name(String name) {
    this.name = defaultIfAbsent(name, this.name);
    return this;
  }

  public ModelBuilder qualifiedType(String qualifiedType) {
    this.qualifiedType = defaultIfAbsent(qualifiedType, this.qualifiedType);
    return this;
  }

  public ModelBuilder properties(Map<String, ModelProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ModelBuilder description(String description) {
    this.description = defaultIfAbsent(description, this.description);
    return this;
  }

  public ModelBuilder baseModel(String baseModel) {
    this.baseModel = defaultIfAbsent(baseModel, this.baseModel);
    return this;
  }

  public ModelBuilder discriminator(String discriminator) {
    this.discriminator = defaultIfAbsent(discriminator, this.discriminator);
    return this;
  }

  public ModelBuilder subTypes(List<String> subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  public ModelBuilder type(ResolvedType modelType) {
    this.modelType = defaultIfAbsent(modelType, this.modelType);
    return this;
  }

  public Model build() {
    return new Model(id, name, modelType, qualifiedType, properties, description, baseModel, discriminator, subTypes);
  }
}