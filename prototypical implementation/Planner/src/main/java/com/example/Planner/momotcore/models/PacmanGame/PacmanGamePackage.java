/**
 */
package com.example.Planner.momotcore.models.PacmanGame;

import com.example.Planner.momotcore.models.PacmanGame.impl.*;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PacmanGameFactory
 * @model kind="package"
 * @generated
 */
public interface PacmanGamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PacmanGame";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.geodes.org/Pacman";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PacmanGame";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanGamePackage eINSTANCE = PacmanGamePackageImpl.init();

	/**
	 * The meta object id for the '{@link GridNodeImpl <em>Grid Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GridNodeImpl
	 * @see PacmanGamePackageImpl#getGridNode()
	 * @generated
	 */
	int GRID_NODE = 0;

	/**
	 * The feature id for the '<em><b>Top</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__TOP = 0;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__BOTTOM = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__RIGHT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE__ID = 4;

	/**
	 * The number of structural features of the '<em>Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Grid Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PositionableEntityImpl <em>Positionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PositionableEntityImpl
	 * @see PacmanGamePackageImpl#getPositionableEntity()
	 * @generated
	 */
	int POSITIONABLE_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY__ON = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY__ID = 1;

	/**
	 * The number of structural features of the '<em>Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Positionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONABLE_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link FoodImpl <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FoodImpl
	 * @see PacmanGamePackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__ON = POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD__ID = POSITIONABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoveableEntityImpl <em>Moveable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoveableEntityImpl
	 * @see PacmanGamePackageImpl#getMoveableEntity()
	 * @generated
	 */
	int MOVEABLE_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_ENTITY__ON = POSITIONABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_ENTITY__ID = POSITIONABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Moveable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_ENTITY_FEATURE_COUNT = POSITIONABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Moveable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEABLE_ENTITY_OPERATION_COUNT = POSITIONABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PacmanImpl <em>Pacman</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PacmanImpl
	 * @see PacmanGamePackageImpl#getPacman()
	 * @generated
	 */
	int PACMAN = 2;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__ON = MOVEABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN__ID = MOVEABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_FEATURE_COUNT = MOVEABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pacman</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACMAN_OPERATION_COUNT = MOVEABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GhostImpl <em>Ghost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GhostImpl
	 * @see PacmanGamePackageImpl#getGhost()
	 * @generated
	 */
	int GHOST = 3;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__ON = MOVEABLE_ENTITY__ON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST__ID = MOVEABLE_ENTITY__ID;

	/**
	 * The number of structural features of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_FEATURE_COUNT = MOVEABLE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ghost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHOST_OPERATION_COUNT = MOVEABLE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ScoreboardImpl <em>Scoreboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ScoreboardImpl
	 * @see PacmanGamePackageImpl#getScoreboard()
	 * @generated
	 */
	int SCOREBOARD = 4;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD__SCORE = 0;

	/**
	 * The number of structural features of the '<em>Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scoreboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOREBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GameImpl
	 * @see PacmanGamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 5;

	/**
	 * The feature id for the '<em><b>Gridnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GRIDNODES = 0;

	/**
	 * The feature id for the '<em><b>Scoreboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__SCOREBOARD = 1;

	/**
	 * The feature id for the '<em><b>Entites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ENTITES = 2;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 3;


	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link GridNode <em>Grid Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Node</em>'.
	 * @see GridNode
	 * @generated
	 */
	EClass getGridNode();

	/**
	 * Returns the meta object for the reference '{@link GridNode#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top</em>'.
	 * @see GridNode#getTop()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Top();

	/**
	 * Returns the meta object for the reference '{@link GridNode#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bottom</em>'.
	 * @see GridNode#getBottom()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Bottom();

	/**
	 * Returns the meta object for the reference '{@link GridNode#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see GridNode#getLeft()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Left();

	/**
	 * Returns the meta object for the reference '{@link GridNode#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see GridNode#getRight()
	 * @see #getGridNode()
	 * @generated
	 */
	EReference getGridNode_Right();

	/**
	 * Returns the meta object for the attribute '{@link GridNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GridNode#getId()
	 * @see #getGridNode()
	 * @generated
	 */
	EAttribute getGridNode_Id();

	/**
	 * Returns the meta object for class '{@link Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for class '{@link Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pacman</em>'.
	 * @see Pacman
	 * @generated
	 */
	EClass getPacman();

	/**
	 * Returns the meta object for class '{@link Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ghost</em>'.
	 * @see Ghost
	 * @generated
	 */
	EClass getGhost();

	/**
	 * Returns the meta object for class '{@link Scoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoreboard</em>'.
	 * @see Scoreboard
	 * @generated
	 */
	EClass getScoreboard();

	/**
	 * Returns the meta object for the attribute '{@link Scoreboard#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see Scoreboard#getScore()
	 * @see #getScoreboard()
	 * @generated
	 */
	EAttribute getScoreboard_Score();

	/**
	 * Returns the meta object for class '{@link Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link Game#getGridnodes <em>Gridnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gridnodes</em>'.
	 * @see Game#getGridnodes()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Gridnodes();

	/**
	 * Returns the meta object for the containment reference '{@link Game#getScoreboard <em>Scoreboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoreboard</em>'.
	 * @see Game#getScoreboard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Scoreboard();

	/**
	 * Returns the meta object for the containment reference list '{@link Game#getEntites <em>Entites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entites</em>'.
	 * @see Game#getEntites()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entites();

	/**
	 * Returns the meta object for class '{@link PositionableEntity <em>Positionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positionable Entity</em>'.
	 * @see PositionableEntity
	 * @generated
	 */
	EClass getPositionableEntity();

	/**
	 * Returns the meta object for the reference '{@link PositionableEntity#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On</em>'.
	 * @see PositionableEntity#getOn()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EReference getPositionableEntity_On();

	/**
	 * Returns the meta object for the attribute '{@link PositionableEntity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PositionableEntity#getId()
	 * @see #getPositionableEntity()
	 * @generated
	 */
	EAttribute getPositionableEntity_Id();

	/**
	 * Returns the meta object for class '{@link MoveableEntity <em>Moveable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moveable Entity</em>'.
	 * @see MoveableEntity
	 * @generated
	 */
	EClass getMoveableEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PacmanGameFactory getPacmanGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GridNodeImpl <em>Grid Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GridNodeImpl
		 * @see PacmanGamePackageImpl#getGridNode()
		 * @generated
		 */
		EClass GRID_NODE = eINSTANCE.getGridNode();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__TOP = eINSTANCE.getGridNode_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__BOTTOM = eINSTANCE.getGridNode_Bottom();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__LEFT = eINSTANCE.getGridNode_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_NODE__RIGHT = eINSTANCE.getGridNode_Right();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_NODE__ID = eINSTANCE.getGridNode_Id();

		/**
		 * The meta object literal for the '{@link FoodImpl <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FoodImpl
		 * @see PacmanGamePackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '{@link PacmanImpl <em>Pacman</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PacmanImpl
		 * @see PacmanGamePackageImpl#getPacman()
		 * @generated
		 */
		EClass PACMAN = eINSTANCE.getPacman();

		/**
		 * The meta object literal for the '{@link GhostImpl <em>Ghost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GhostImpl
		 * @see PacmanGamePackageImpl#getGhost()
		 * @generated
		 */
		EClass GHOST = eINSTANCE.getGhost();

		/**
		 * The meta object literal for the '{@link ScoreboardImpl <em>Scoreboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ScoreboardImpl
		 * @see PacmanGamePackageImpl#getScoreboard()
		 * @generated
		 */
		EClass SCOREBOARD = eINSTANCE.getScoreboard();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOREBOARD__SCORE = eINSTANCE.getScoreboard_Score();

		/**
		 * The meta object literal for the '{@link GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GameImpl
		 * @see PacmanGamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Gridnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__GRIDNODES = eINSTANCE.getGame_Gridnodes();

		/**
		 * The meta object literal for the '<em><b>Scoreboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__SCOREBOARD = eINSTANCE.getGame_Scoreboard();

		/**
		 * The meta object literal for the '<em><b>Entites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ENTITES = eINSTANCE.getGame_Entites();

		/**
		 * The meta object literal for the '{@link PositionableEntityImpl <em>Positionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PositionableEntityImpl
		 * @see PacmanGamePackageImpl#getPositionableEntity()
		 * @generated
		 */
		EClass POSITIONABLE_ENTITY = eINSTANCE.getPositionableEntity();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITIONABLE_ENTITY__ON = eINSTANCE.getPositionableEntity_On();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONABLE_ENTITY__ID = eINSTANCE.getPositionableEntity_Id();

		/**
		 * The meta object literal for the '{@link MoveableEntityImpl <em>Moveable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoveableEntityImpl
		 * @see PacmanGamePackageImpl#getMoveableEntity()
		 * @generated
		 */
		EClass MOVEABLE_ENTITY = eINSTANCE.getMoveableEntity();

	}

} //PacmanGamePackage
