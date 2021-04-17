//package com.heart.impl;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//import com.heart.model.DeckVO;
//// import com.heart.model.DeckVO2_cho;
//
//public class BlackJackRule_cho2 extends BlackJackRuleImplV3 {
//
//	List<DeckVO> deckList;
//
//	Random rnd = new Random();
//
//	private int num = 0;
//
//	BlackJackYubin makeDeck;
//
//	DeckVO deckVO;
//
//	public BlackJackRule_cho2() {
//
//		makeDeck = new BlackJackYubin();
//
//		deckVO = new DeckVO();
//	}
//
//	@Override
//	public void suffleDeck() {
//		// TODO 카드 덱 셔플
//
//		deckList = makeDeck.deckList; //// 유빈 클래스에서 만들어진 deckList를 여기에서도 쓰기 위함. 거기 있던 deckList를 여기 deckList에 담음
//		makeDeck.createDeck(); //// 유빈 클래스에서의 createDeck 메서드 여기서 실행
//
//		Collections.shuffle(deckList); //// 카드 섞기
//
////		for (int i = 0; i < deckList.size(); i++) {
////			DeckVO vo = deckList.get(i);
////			System.out.println(vo.getDeck() + "\t" + vo.getValue());
////		}
//
//	}
//
//	// playScreen에서 참조값 num 설정해두어야 한다.
//	//// 매개변수로 플레이어카드리스트 OR 딜러카드리스트 받아서, 순서대로 뽑은 카드를 하나씩 추가해줌
//	@Override
//	public void handDeck(List<DeckVO> list) {
//
//		DeckVO vo = deckList.get(num);
//
//		vo.getDeck();
//		vo.getValue();
//
//		num++;
//
//		list.add(vo);
//
//	}
//}