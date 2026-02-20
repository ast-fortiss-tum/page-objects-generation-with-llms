# Page Objects Generation with LLMs

This repository explores **automated Page Object (PO) generation** for web GUI testing using **Large Language Models (LLMs)**.  
It provides prompt templates, HTML preprocessing scripts, and evaluation tools to assess the correctness and completeness of LLM-generated Page Objects against manually curated ground-truth implementations.

> 🎯 **Goal:** Given an HTML page, automatically generate a Page Object class capturing UI elements and interaction methods.

---

## ✨ Key Features

- **LLM-based PO generation** from static HTML snapshots  
- **Four-way evaluation taxonomy**:
  - ✅ **Correct** – matches ground truth
  - ✏️ **To Modify** – small fix required
  - ❌ **Missing** – absent vs ground truth
  - ➕ **Extra** – generated beyond ground truth  
- **Support for multiple models**: GPT-4o, DeepSeek Coder.  

---

## 🔧 Requirements

API keys (example):

```bash
export OPENAI_API_KEY=...
export DEEPSEEK_API_KEY=...
```

---

## 🚀 Quick Start

## 📊 Evaluation Metrics

| Label       | Meaning                                             |
|-------------|-----------------------------------------------------|
| **Correct** | Matches locator/type/name or method intent          |
| **To Modify** | Present, requires minor fix                      |
| **Missing** | Ground truth item absent                           |
| **Extra**   | Generated beyond ground truth                      |

**Aggregate Metrics:**

- **Accuracy (methods)**
- **Element Recognition Rate**

---

## ▶️ Study Replication

The original evaluation used:

- **Bludit**, **ExpressCart**, **Kanboard**, **MediaWiki**, **PrestaShop**

---

## 📖 Reference

If you use our work in your research, if you extend it, or if you simply like it, please cite it in your publications.

Here is an example BibTeX entry:

```bibtex
@inproceedings{2026-Karagoz-ICST,
    author    = {Bet\"ul Karag\"oz and Filippo Ricca and Matteo Biagiola and Andrea Stocco},
    title     = {Towards Automated Page Object Generation for Web Testing using Large Language Models},
  	booktitle    = {Proceedings of the 19th IEEE International Conference on Software Testing, Verification and Validation},
  	series       = {ICST '26},
  	publisher    = {IEEE},
  	year         = 2026
}
```

## 📜 License

Distributed under the **MIT License**.

---
