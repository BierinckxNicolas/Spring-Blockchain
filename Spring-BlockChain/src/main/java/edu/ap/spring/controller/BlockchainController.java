package edu.ap.spring.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;

import edu.ap.spring.service.BlockChain;

@Controller
public class BlockchainController {

   private final BlockChain service;

   public BlockchainController(BlockChain service) {
        this.service = service;
    }

}