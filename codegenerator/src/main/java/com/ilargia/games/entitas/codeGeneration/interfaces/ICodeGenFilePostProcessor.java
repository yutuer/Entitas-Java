package com.ilargia.games.entitas.codeGeneration.interfaces;

import com.ilargia.games.entitas.codeGeneration.CodeGenFile;

import java.util.List;

public interface ICodeGenFilePostProcessor extends ICodeGeneratorInterface {

    List<CodeGenFile> postProcess(List<CodeGenFile> files);
}