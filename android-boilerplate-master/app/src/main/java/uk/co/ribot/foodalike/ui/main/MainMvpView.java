package uk.co.ribot.foodalike.ui.main;

import java.util.List;

import uk.co.ribot.foodalike.data.model.Ribot;
import uk.co.ribot.foodalike.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
