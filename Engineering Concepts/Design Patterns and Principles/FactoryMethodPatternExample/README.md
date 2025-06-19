# 🏗️ Factory Method Pattern - Document Management System

This project demonstrates the **Factory Method Design Pattern** in Java by simulating a Document Management System that can create different types of documents like Word, PDF, and Excel.

---

## 📚 What is the Factory Method Pattern?

The Factory Method Pattern is a **creational design pattern** that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

In this example, `DocumentFactory` is the abstract creator, and its subclasses (`WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory`) are concrete creators.

---

## 🧱 Structure

- `Document` – Interface for all documents.
- `WordDocument`, `PdfDocument`, `ExcelDocument` – Concrete document implementations.
- `DocumentFactory` – Abstract factory.
- `WordDocumentFactory`, `PdfDocumentFactory`, `ExcelDocumentFactory` – Concrete factories.
- `FactoryMethodPatternTest` – Class to test the factory method pattern.

---

## Output

Opening Word Document
Opening PDF Document
Opening Excel Document


